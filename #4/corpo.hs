corpo a = reverse $ drop 1 $ reverse a

main = do
    a <- readLn :: IO [Int]
    print $ corpo a