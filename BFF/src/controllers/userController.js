const axios = require("axios");
const User = require("../models/userModel");

const API_URL = "https://serverless-ticketit.azurewebsites.net/api/users";

exports.createUser = async (req, res) => {
  try {
    const userData = req.body;
    const response = await axios.post(`${API_URL}`, userData);
    res.status(201).json(response.data);
  } catch (error) {
    res.status(500).json({ error: error.message });
  }
};

exports.getAllUsers = async (req, res) => {
  try {
    const response = await axios.get(`${API_URL}`);
    res.status(200).json(response.data);
  } catch (error) {
    res.status(500).json({ error: error.message });
  }
};

exports.getUserById = async (req, res) => {
  try {
    const { id } = req.params;
    const response = await axios.get(`${API_URL}/${id}`);
    res.status(200).json(response.data);
  } catch (error) {
    res.status(500).json({ error: error.message });
  }
};

exports.updateUser = async (req, res) => {
  try {
    const { id } = req.params;
    const userData = req.body;
    const response = await axios.put(`${API_URL}/${id}`, userData);
    res.status(200).json(response.data);
  } catch (error) {
    res.status(500).json({ error: error.message });
  }
};

exports.deleteUser = async (req, res) => {
  try {
    const { id } = req.params;
    await axios.delete(`${API_URL}/${id}`);
    res.status(204).send();
  } catch (error) {
    res.status(500).json({ error: error.message });
  }
};
