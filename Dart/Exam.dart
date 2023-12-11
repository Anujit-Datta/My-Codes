void main(){
  List<Map<String,dynamic>> fruits=[];
  fruits.add({
    'Name': 'Apple',
    'Color': 'Red',
    'Price': 2.5,
  });
  fruits.add({
    'Name': 'Banana',
    'Color': 'Yellow',
    'Price': 1.0,
  });
  fruits.add({
    'Name': 'Grape',
    'Color': 'Purple',
    'Price': 3.0,
  });
  print('Original Fruit Details before Discount:\n');
  displayFruitDetails(fruits);
  applyPriceDiscount(fruits, 10);
  print('\n\nFruit Details After Applying 10% Discount:\n');
  displayFruitDetails(fruits);
  
}

displayFruitDetails(List<Map<String,dynamic>> fruits){
  fruits.forEach((element) {print('Name: '+element['Name']+', Color'+element['Color']+', Price: \$'+element['Price'].toString());});
}

applyPriceDiscount(List<Map<String,dynamic>> fruits,double discount){
  fruits.forEach((element) {
    element['Price']=element['Price']-element['Price']*(discount/100);
  });
}





