const axios = require("axios");
const Ticket = require("../models/ticketModel");

const API_URL = process.env.API_URL || "http://localhost:8080/ticket";
const API_URL_SERVERLESS = "https://serverless-ticketit.azurewebsites.net/api/users";

exports.getTicketById = async (req, res) => {
  try {
    const { id } = req.params;
    const response = await axios.get(`${API_URL}/${id}`);
    const ticketData = response.data;

    const user = await axios.get(`${API_URL}/${ticketData.userId}`);
    const ticket = new Ticket(ticketData.id, ticketData.quantity, ticketData.value, ticketData.verified, ticketData.preSale, ticketData.event, ticketData.userId, user.name);

    res.status(200).json(ticket);
  } catch (error) {
    res.status(500).json({ error: error.message });
  }
};

exports.createTicket = async (req, res) => {
  try {
    const ticketData = req.body;
    const response = await axios.post(API_URL, ticketData);
    res.status(201).json(response.data);
  } catch (error) {
    res.status(500).json({ error: error.message });
  }
};

exports.deleteTicket = async (req, res) => {
  try {
    const { id } = req.params;
    await axios.delete(`${API_URL}/${id}`);
    res.status(204).send();
  } catch (error) {
    res.status(500).json({ error: error.message });
  }
};

exports.updateTicket = async (req, res) => {
  try {
    const { id } = req.params;
    const ticketData = req.body;
    const response = await axios.put(`${API_URL}/${id}`, ticketData);
    res.status(200).json(response.data);
  } catch (error) {
    res.status(500).json({ error: error.message });
  }
};
