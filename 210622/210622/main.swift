//
//  main.swift
//  210622
//
//  Created by Hiraku OHNO on 2021/06/22.
//

import Foundation

func readTexts() -> [String] {
    return readLine()!.split(separator: " ").map { String($0) }
}

func readNumbers() -> [Int64] {
    return readLine()!.split(separator: " ").map { Int64($0)! }
}

func solve() {
    let NK = readNumbers()
    
    let N = NK[0]
    var K = NK[1]
    
    var ABs = [[Int64]]()
    
    for _ in 0..<N {
        ABs.append(readNumbers())
    }
    
    ABs.sort { x, y in
        x[0] < y[0]
    }
    
    var ans = Int64(0)
    while K > 0 {
        var targets = [[Int64]]()
        for x in ABs {
            if ans < x[0] && x[0] <= K + ans {
                targets.append(x)
                
            }
        }
//        let targets = ABs.filter { x in
//            ans < x[0] && x[0] <= K + ans
//        }
        if (targets.isEmpty) {
            break
        }
        ABs = ABs.filter({ v in
            v[0] > K + ans
        })

        K -= (targets.last![0] - ans)

        ans = targets.last?[0] ?? 0
        let toAdd  = targets.reduce(0, { x, AB in
            x + AB[1]
        })
        K += toAdd
    }
    
    ans += K
    
    print(ans)
}

solve()

