# coffee-machine
Coffee machine 
Write the working code to create a working coffee machine. Here are the desired  features 
1. It will be serving some beverages. 
2. Each beverage will be made using some ingredients. 
3. Assume time to prepare a beverage is the same for all cases. 4. The quantity of ingredients used for each beverage can vary. Also the same  ingredient (ex: water) can be used for multiple beverages. 
5. There would be N ( N is an integer ) outlet from which beverages can be  served. 
For N = 2 [ 2 outlets in a machine ] 

For N = 3 [ 3 outlets in a machine ] 

6. Maximum N beverages can be served in parallel. 
7. Any beverage can be served only if all the ingredients are available in terms  of quantity. 
8. There would be an indicator which would show which all ingredients are  running low. We need some methods to refill them.
9. Please provide functional integration test cases for maximum coverage. 
Example: 
Consider Chai Point machine which serves these drinks: 
1. ginger tea 
2. elaichi tea 
3. coffee 
4. hot milk 
5. hot water 
the machine has N outlets for serving these drinks 
Here is the composition for each drink: 
1. ginger tea: 
- hot water 50 ml 
- hot milk 10 ml 
- tea leaves syrup 10 ml 
- ginger syrup 5 ml 
- sugar syrup 10 ml 
2. elaichi tea: 
- hot water 50 ml 
- hot milk 10 ml 
- tea leaves syrup 10 ml 
- elaichi syrup 5 ml 
- sugar syrup 10 ml 
3. coffee: 
- hot water 50 ml 
- hot milk 10 ml 
- coffee syrup 10 ml 
- sugar syrup 10 ml 
4. hot milk: 
- milk 50 ml 
5. hot water 
- water 50 ml 
Note: Since there are N outlets, N people can take beverages at the same time. 
Input Test Json :- https://www.npoint.io/docs/e8cd5a9bbd1331de326a Expected Output :- This input can have multiple output based on the processes  priority 
Output 1 
hot_tea is prepared 
hot_coffee is prepared
green_tea cannot be prepared because green_mixture is not available black_tea cannot be prepared because item hot_water is 0 
Or 
Output 2 
hot_tea is prepared 
black_tea is prepared 
green_tea cannot be prepared because green_mixture is not available hot_coffee cannot be prepared because item hot_water is 0 
Or 
Output 3 
hot_coffee is prepared 
black_tea is prepared 
green_tea cannot be prepared because green_mixture is not available hot_tea cannot be prepared because item hot_water is 0 
