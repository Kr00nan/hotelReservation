

User Scenarios
- creating a customer account: The user needs to first create a customer account before they can create a reservation.
- searching for rooms: The app should allow the user to search for available rooms based on provided checking and checkout dates.
    if the application has available rooms for the specified date range, a list of the corresponding rooms will be displayed
    to the user for choosing.
- booking a room: Once the user has chosen a room, the app will allow them to book the room and create a reservation.
- viewing reservations: After booking a room, the app allows customers to view a list of all their reservations.

Admin Scenarios
- displaying all customers accounts
- viewing all the rooms in the hotel
- viewing all the hotel reservations
- adding a room to the hotel application

Reserving a Room - requirements
- avoid conflicting reservations: A single room may only be reserved by a single customer per checkin and checkout date
    range.
- search for recommended rooms: If there are no available rooms for the customer's date range, a search will be performed
    that displays recommended rooms on alternative dates. The recommended room search will add seven days to the original
    checkin and checkout dates to see if the hotel has any availabilities, and then display the recommended rooms/dates
    to the customer.

Room Requirements
- room cost: Rooms will contain a price per night. When displaying rooms, paid rooms will display the price per night and
    free rooms will display "Free" or have a $0 price.
- unique room numbers: Each room will have a unique room number, meaning no two rooms can have the same room number
- room type: rooms can be either single occupant or double occupant

Customer Requirements
- unique email: RegEx is used to check that the email is in the correct format
- first name and last name

Error Requirements
- No Crashing :: the application does not crash based on user input
- No unhandled exceptions :: the app has 'try catch' blocks that are used to capture exceptions and provide useful
    information to the user. there are not unhandled exceptions.