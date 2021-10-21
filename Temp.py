import matplotlib.pyplot as plt
x1=[1,2,3,4,5,6,7,8,9,10]
y1=[5,6,34,56,32,56,32,12,76,89]
x2=[1,2,3,4,5,6,7,8,9,10]
y2=[53,6,46,36,15,64,73,25,82,9]
plt.title("Price over 10 years")
plt.scatter(x1,y1,color="darkblue",marker='x',label='item 1')
plt.scatter(x2,y2,color="darkred",marker='x',label='item 2')
plt.xlabel("Time(year)")
plt.ylabel("Price(dollers)")
plt.grid(True)
plt.legend()
plt.show()