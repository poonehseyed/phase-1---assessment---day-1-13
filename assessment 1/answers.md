Class vs Object
Class is a template of an entity, like when in library book management system want to define a book as an entity, the book will be the model class and in  it can define fields and methods that define book attributes and how can manage the book for example registerBook() as method.
Class has access modifier, Class keyword and class name in PascalName
Public Class Book{}

When want to use this class in our system we require to create objects from that class to use it in the program, because class is just known as  definition not the way can use the entity in the system.

But model class is just one type of class others are as Util, enum, service, controller, repository, these are I remember.

When the object is created an instance of will be create in heap memory. But class will not take that much memory (forgot where in memory class located)

Book sampleBook = new Book();

//فایل‌های تکالیف را طبق نام‌ها بالا اضافه کن (Day01_Book.java ... Day13_Review.md).