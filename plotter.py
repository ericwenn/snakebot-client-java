import matplotlib.pyplot as plt
from mpl_toolkits.mplot3d import Axes3D
import numpy as np
import sys

filename = sys.argv[1]

def _get_data(filename):
    XYZs = []
    with open(filename) as d:
        data_str = d.read()
        for row in data_str.split('\n'):
            ion = row.split(' ')
            if len(ion) > 1:
                XYZs.append( [ int(ion[0]), int(ion[1]), int(ion[2])])

    return np.array(XYZs)

data = _get_data(filename)
tick = data[:,0]
snakes_alive = data[:,1]
time = np.divide(data[:,2], 100000)
c = np.abs(snakes_alive)
cmhot = plt.get_cmap("winter")
fig = plt.figure()
ax = fig.add_subplot(111, projection='3d')
ax.scatter(snakes_alive, tick,time, c=c, cmap=cmhot)
ax.view_init(0, 0)
plt.show()
