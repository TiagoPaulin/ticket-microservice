const axios = require("axios");
const Phone = require("../models/phoneModel");

const API_URL = "https://serverless-ticketit.azurewebsites.net/api";

exports.createPhone = async (req, res) => {
  try {
    const phoneData = req.body;
    const response = await axios.post(`${API_URL}/phones_create_a_phone`, phoneData);
    res.status(201).json(response.data);
  } catch (error) {
    res.status(500).json({ error: error.message });
  }
};

exports.getAllPhones = async (req, res) => {
  try {
    const response = await axios.get(`${API_URL}/phones_get_phones`);
    res.status(200).json(response.data);
  } catch (error) {
    res.status(500).json({ error: error.message });
  }
};

exports.getPhoneById = async (req, res) => {
  try {
    const { id } = req.params;
    const response = await axios.get(`${API_URL}/phones/${id}`);
    res.status(200).json(response.data);
  } catch (error) {
    res.status(500).json({ error: error.message });
  }
};

exports.updatePhone = async (req, res) => {
  try {
    const { id } = req.params;
    const phoneData = req.body;
    const response = await axios.put(`${API_URL}/phone/${id}`, phoneData);
    res.status(200).json(response.data);
  } catch (error) {
    res.status(500).json({ error: error.message });
  }
};

exports.deletePhone = async (req, res) => {
  try {
    const { id } = req.params;
    await axios.delete(`${API_URL}/phones/${id}`);
    res.status(204).send();
  } catch (error) {
    res.status(500).json({ error: error.message });
  }
};
