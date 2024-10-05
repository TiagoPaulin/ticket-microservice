class Ticket {
  constructor(id, quantity, value, verified, preSale, event) {
    this.id = id;
    this.quantity = quantity;
    this.value = value;
    this.verified = verified;
    this.preSale = preSale;
    this.event = event;
  }
}

module.exports = Ticket;
