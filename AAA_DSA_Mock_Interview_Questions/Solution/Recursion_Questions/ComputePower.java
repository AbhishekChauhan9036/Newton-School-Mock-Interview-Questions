static int Power(int x, int y)
    {
        if (y == 0)
            return 1;
        else if (y % 2 == 0)
            return Power(x, y / 2) * Power(x, y / 2);
        else
            return x * Power(x, y / 2) * Power(x, y / 2);
    }