interior xs = reverse $ drop 1 (reverse $ drop 1 xs)

main = do
    xs <- readLn :: IO [Int]
    print $ interior xs