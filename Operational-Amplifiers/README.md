## Aim:

The aim of this project is to implement both inverting and noninverting operational amplifier (Op-Amp) circuits using ADALM1000 and obtain accurate results.

## Materials required:
* ADALM1000 hardware module
* Solder-less breadboard and jumper wire kit
* AD8542 devices (CMOS rail-to-rail amplifier)
* 1kΩ and 470Ω resistors

## Challenge 1: Non-inverting

![image](https://user-images.githubusercontent.com/59824729/121837734-03a28080-ccf4-11eb-84be-ed86f644d181.png)

### Procedure:
1. Connect the circuit according to the diagram above.
2. In order to get the gain in a non-inverting amplifier, we use A=1+Rf/Rin.
3. Taking different values of Rin, use the above formula to calculate gain(A).
4. Record the values in a table, shown as the P-P value in CA and CB.
5. Check if the ratio of obtained channel B voltage to channel A voltage is equal to
the calculated gain
6. Check if channel B is equal to calculated gain*Vin

![image](https://user-images.githubusercontent.com/59824729/121837842-4401fe80-ccf4-11eb-95ae-c199b5fe11d5.png)

### Screenshots: Setting for all three shapes & cases:



## Challenge 2 : Inverting

![image](https://user-images.githubusercontent.com/59824729/121838311-2a14eb80-ccf5-11eb-97dd-57a248c54960.png)

### Procedure:
1. Connect the circuit according to the diagram above.
2. In order to get the gain in a inverting amplifier, we use A=Rf/Rin.
3. Taking different values of Rin, use the above formula to calculate gain(A).
4. Record the values in a table, shown as the P-P value in CA and CB.
5. Check if the ratio of obtained channel B voltage to channel A voltage is equal to the calculated gain
6. Check if channel B is equal to calculated gain*Vin

![image](https://user-images.githubusercontent.com/59824729/121838344-3ef17f00-ccf5-11eb-9964-71149f037eb3.png)

### Screenshots: Setting for all three shapes & cases:

![image](https://user-images.githubusercontent.com/59824729/121838298-21241a00-ccf5-11eb-9a43-99e2f2d8b222.png)

## Inference

![image](https://user-images.githubusercontent.com/59824729/121838194-eae69a80-ccf4-11eb-85db-7a9b86499154.png)

The given wave form is of an inverting Op-Amp since the waves have a phase difference of 180 degrees. Since the both the amplitudes of the sine waves are equal and the ratio of Channel A : Channel B is almost 1, the gain is 1.
When CA-V is changed to 2.0V and 3.0V, waves similar to the ones above are observed but the graphs have been shifted up by 2.5V. When the shape is changed to DC, the sine waves change to a constant straight line parallel to the x-axis.

![image](https://user-images.githubusercontent.com/59824729/121838217-f4700280-ccf4-11eb-9eeb-0ded08cc72f1.png)

![image](https://user-images.githubusercontent.com/59824729/121838228-fafe7a00-ccf4-11eb-9da8-1832cd0282d1.png)

## Reference: 
* https://www.daenotes.com/electronics/devices-circuits/inverting-and-non-inverting-amplifiers 
* https://electronicsforu.com/resources/learn-electronics/inverting-non-inverting-amplifier-basics 
* https://circuitdigest.com/tutorial/non-inverting-operational-amplifier 
* https://circuitdigest.com/tutorial/inverting-operational-amplifier-op-amp 
