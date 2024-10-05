class EventType {
  constructor(id, description, events) {
    this.id = id;
    this.description = description;
    this.events = events || [];
  }
}

module.exports = EventType;
