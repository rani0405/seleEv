const axios = require('axios');

// Base URL for Reqres API
const BASE_URL = 'https://reqres.in/api';

// Function to login and get token
async function login() {
  try {
    const response = await axios.post(`${BASE_URL}/login`, {
      email: "eve.holt@reqres.in",
      password: "pistol"
    });
    console.log('✅ Login Successful:', response.data);
    return response.data.token; // Return the token
  } catch (error) {
    console.error('❌ Login Failed:', error.response.data);
  }
}

// Function to get list of users (protected if needed)
async function getUsers(token) {
  try {
    const response = await axios.get(`${BASE_URL}/users?page=2`, {
      headers: {
        Authorization: `Bearer ${token}` // Use token if required
      }
    });
    console.log('✅ GET List of Users:', response.data);
  } catch (error) {
    console.error('❌ Error fetching users:', error.response.status, error.response.data);
  }
}

// Main function to run tests
async function runTests() {
  const token = await login();
  if (token) {
    await getUsers(token);
  }
}

runTests();
