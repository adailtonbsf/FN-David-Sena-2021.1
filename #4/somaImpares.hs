somaImpares xs = sum [x | x <- xs, odd x]

main = do
    xs <- readLn :: IO [Int]
    print $ somaImpares xs