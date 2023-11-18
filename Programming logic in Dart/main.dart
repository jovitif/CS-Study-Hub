import 'dart:io';

void mainMenu() {
  print("==== Main Menu ====");
  print("1. Add a Person");
  print("2. List All People");
  print("3. Update a Person");
  print("4. Delete a Person");
  print("5. Exit");
  print("Choose an option:");

  int choice = int.parse(stdin.readLineSync()!);

  switch (choice) {
    case 1:
      print("1. Add a Person");
      break;
    case 2:
      print("2. List All People");
      break;
    case 3:
      print("3. Update a Person");
      break;
    case 4:
      print("4. Delete a Person");
      break;
    case 5:
      exit(0);
    default:
      print("Invalid choice. Please choose a valid option.");
      break;
  }
}

void main() {
  while (true) {
    mainMenu();
  }
}
