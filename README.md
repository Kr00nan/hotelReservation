## hotelReservation

#### Udacity - Java NanoDegree :: Hotel Reservation

A place to store my project for Udacity's Java Nanodegree

####User Scenarios
- **Creating a customer account.** The user needs to first create a customer account before they can create a reservation.
    - Enter Email format: name@domain.com
    - First Name
    - Last Name
- **Searching for rooms.** The app should allow the user to search for available rooms based on provided checking and checkout dates.
    if the application has available rooms for the specified date range, a list of the corresponding rooms will be displayed
    to the user for choosing.
    - Enter CheckIn Date mm/dd/yyyy example 02/01/2020
    - Enter CheckOut Date month/day/year example 02/21/2020
    - (List Rooms)
    - Would you like to book a room? y/n
    - Do you have an account with us? y/n
    - Enter Email format: name@domain.com
    - What room number would you like to reserve?
    
- **Booking a room.** Once the user has chosen a room, the app will allow them to book the room and create a reservation.
- **Viewing reservations.** After booking a room, the app allows customers to view a list of all their reservations.

####Admin Scenarios
- Displaying all customers accounts
- Viewing all the rooms in the hotel
- Viewing all the hotel reservations
- Adding a room to the hotel application
    - Enter room number
    - Enter price per night
    - Enter room type: 1 for single bed, 2 for double bed
    - Would you like to add another room y/n
    - Crash Handling: Please enter Y (Yes) or N (No)

####Reserving a Room - requirements
- **Avoid conflicting reservations.** A single room may only be reserved by a single customer per checkin and checkout date
    range.
- **Search for recommended rooms.** If there are no available rooms for the customer's date range, a search will be performed
    that displays recommended rooms on alternative dates. The recommended room search will add seven days to the original
    checkin and checkout dates to see if the hotel has any availabilities, and then display the recommended rooms/dates
    to the customer.

####Room Requirements
- **Room cost.** Rooms will contain a price per night. When displaying rooms, paid rooms will display the price per night and
    free rooms will display "Free" or have a $0 price.
- **Unique room numbers.** Each room will have a unique room number, meaning no two rooms can have the same room number
- **Room type.** rooms can be either single occupant or double occupant

####Customer Requirements
- **Unique email.** RegEx is used to check that the email is in the correct format
- **First name and last name.**

####Error Requirements
- **No Crashing** :: the application does not crash based on user input
- **No unhandled exceptions** :: the app has 'try catch' blocks that are used to capture exceptions and provide useful
    information to the user. there are not unhandled exceptions.
