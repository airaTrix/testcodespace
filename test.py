import pandas as pd
import numpy as np


def test():
    num = {'a': 1, 'b': 2, 'c': 3}
    df = pd.DataFrame(num, index=[0])
    print(df)
    return df


test()