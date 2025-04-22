from math import sqrt
class Solution:
    def primesUpTo(self, n):
        primes = set(range(2, n + 1))
        for i in range(2, n):
            if i in primes:
                it = i * 2
                while it <= n:
                    if it in primes:
                        primes.remove(it)
                    it += i

        return primes

    def getPrimeFactors(self, n, primes):
        ret = {}
        sq = int(math.sqrt(n))

        for p in primes:
            if n in primes:
                ret[n] = 1
                break

            while n % p == 0:
                ret[p] = ret.get(p, 0) + 1
                n //= p

            if n <= 1:
                break

        return ret
        
    def idealArrays(self, n: int, maxValue: int) -> int:
        mod = 10**9 + 7
        ret = 0
        primes = self.primesUpTo(maxValue)
        
        for num in range(1, maxValue + 1):
            pf = self.getPrimeFactors(num, primes)
            cur = 1
            for d in pf:
                ct = pf[d]
                v = n
                for add in range(1, ct):
                    v *= (n + add)
                    v //= (add + 1)
                cur = (cur * v) % mod
            ret = (ret + cur) % mod
        return ret