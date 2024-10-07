class Ticket {
  constructor(id, quantity, value, verified, preSale, event, userId) {
    this.id = id;
    this.quantity = quantity;
    this.value = value;
    this.verified = verified;
    this.preSale = preSale;
    this.event = event;
    this.userId = userId;
  }
}

module.exports = Ticket;
