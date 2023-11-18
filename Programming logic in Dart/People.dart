import 'WeekDay.dart';

class People {
  final String name, email, username, password, id;
  final int age;
  final double height, weight;
  final bool isActive;
  final List<WeekDay> days;
  final Map<String, dynamic> comments;

  People(
    this.age,
    this.comments,
    this.days,
    this.email,
    this.height,
    this.id,
    this.isActive,
    this.name,
    this.password,
    this.username,
    this.weight,
  );
}
