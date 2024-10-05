class Event {
  constructor(id, name, description, date, time, type, tickets) {
    this.id = id;
    this.name = name;
    this.description = description;
    this.date = date;
    this.time = time;
    this.type = type;
    this.tickets = tickets || [];
  }
}

module.exports = Event;
