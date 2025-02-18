```groovy
def myMethod(List<String> list) {
  list.each { item ->
    if (item == null) {
      println "Null item found"
      return //This will exit the each loop prematurely
    }
    println item
  }
}

myMethod(['a', 'b', null, 'd']) 
```