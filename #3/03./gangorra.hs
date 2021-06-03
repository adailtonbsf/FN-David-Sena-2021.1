gangorra a b c d
  | a * b < c * d = 1
  | a * b > c * d = -1
  | otherwise = 0

main = do
    a <- readLn :: IO Int
    b <- readLn :: IO Int
    c <- readLn :: IO Int
    d <- readLn :: IO Int
    print $ gangorra a b c d