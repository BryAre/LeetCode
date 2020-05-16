#include <vector>
#include <iostream>
#include <bits/stdc++.h>

class Solution
{
public:
    std::vector<bool> kidsWithCandies(std::vector<int> &candies, int extraCandies)
    {
        std::vector<bool> p;
        int max = INT_MIN;

        for (int i = 0; i < candies.size(); i++)
        {
            if (candies[i] > max)
                max = candies[i];
        }
        std::cout << max;

        for (int i = 0; i < candies.size(); i++)
        {
            if (candies[i] + extraCandies >= max)
            {
                p.push_back(true);
            }
            else
                p.push_back(false);
        }
        return p;
    }
};