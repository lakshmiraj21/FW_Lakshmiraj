# Zoho_Lakshmiraj

As I was vaccinated by friday and not feeling well for past two days, So I was unable to complete the problem completely.

Hence I wrote down my solution in words.

Get two options one for Customer booking and other options as Printing delivery exectutive history.

For Customer Booking with n Delivery Executives: 
	1. Create a customer model using object file with the input given.
	2. Keep delivery executives list array of DeliveryExecModel class.
	3. Allot the Delivery executive by comparing previous delivery executive time and current customer order time. When it has same Restaurant 	   and same Restaurant and delivery point.
	4. While alloting calculate delivery charge as (50 + 5 * (n-1)).
	5. If previous delivery executive pickup time is past the current user order time. Get List of already alloted delivery members who are 	   currently finished their order.
	6. Get delivery exective with least delivery charge money earned and assign the order for him.
	7. At the end of every assignment write the delivery executive list array in to a text file.

For Printing Deleivery Executive history.
	1. Get the delivery executive list from the stored text file.
	2. Group delivery executive and calculate their allotment fee as (n* no of trips) + Total delivery charges of each trip stored.
	3. Print the grouped data with Delivery executive name, Allowances, Delivery charges and Total (Delivery charge + Allowances).


Classes used:
	1. Main class: To show Book order and Print Delivery Executive list list.
	2. DeliveryExec.java: Class for mainting delivery exective datas, Alloting orders, and printing the history of Delivery executives
	3. DeliveryExecModel.java: Model class for each delivery exective during a single trip.
	4. CustomerModel.java: Model class for each customer booking data.


  	Class methods:
		DeliveryExec:
			+ AllotDelivery(customer): For alloting delivery exective to the order with customer model as a parameter.
			+ PrintDeliveryHistory: To print the history of delivery executive orders using data from the text file stored datas of 			                        delivery list.

