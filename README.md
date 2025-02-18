# Groovy 'each' Loop Gotcha

This example demonstrates a common pitfall when using the `each` method in Groovy.  Improper use of `return` within the closure can lead to unexpected behavior.

The `bug.groovy` file shows the problem: a null check within the loop causes premature termination of the entire method. The `bugSolution.groovy` demonstrates the correct way to handle this using `continue`.