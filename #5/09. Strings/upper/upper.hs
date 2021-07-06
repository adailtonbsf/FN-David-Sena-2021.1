upper [] = []
upper (x : xs)
  | x `elem` ['a'..'z'] = head [z | (y,z) <- zip ['a' .. 'z'] ['A' .. 'Z'], y == x] : upper xs
  | otherwise = x : upper xs

main = do
    a <- getLine
    print $ upper a