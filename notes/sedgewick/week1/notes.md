# Notes from Sedgewick course

* Quick find problem - Union Find
* Brute force solution has complexity O(n<sup>2</sup>)
* Better solution is to use the quick find.  It has O(n) complexity


### Percolation
* Percolation: A phenomena to find if in an NxN grid, the top and bottom open sites are connected. 
* Percolation also relates to Monte Carlo simulation.

### Analysis of Algorithms
* Programmers solve a problem, clients worry about efficiency and budget, theroreticians worry about the inner workings.  
* Charles Babbage quote on analytical engines.
* Discreet Fourier transforms algorithm case study.  N body simulation case study.
* Insight: Use scientific method to understand performance in operations.
* Scientific Method:
    + Observe, Hypothesize, Predict, Verify, Validate.
    + Principles: Reproducible experiments, Falsifiable hypothesis
* Log log plot gives the slope of the line that hints at the complexity of the algorithm, with power law.
* There are lot of effects on running time of algorithm.  Experimental algorithmics is helpful here.

### Mathematical Models
* Simplification of the algorithm by reducing into the number of operations.  
    + Cost Model
    + Tilde notation: Ignore lower order terms
        + When N is large, ignore the lower order terms as they are relatively negligible
        + When N is small, it does not matter anyway
        + e.g. f(n) ~ g(n) if lim f(n)/g(n) = 1 as n --> INFINITY 
* In principle, the accurate mathematical models for approximating algorithms is possible, but practically it's not worth it.  Approximate models are enough.
* <code> int sum = 0; <br>
  for (int i = 0; i < n; i++) <br>
        for (int j = i+1; j < n; j++) <br>
          for (int k = 1; k < n; k = k*2) <br>
              if (a[i] + a[j] >= a[k]) sum++; </code> <br> 
         Ans: 3/2 . lg n<sup>^2</sup>
         
##### Order of Growth Algorithms
* Constant, logarithmic, linear, linearthmic, quadratic, cubic, exponential
* We need linear or linearithmic algos at least to keep pace with Moore's law.
* Binary search.        