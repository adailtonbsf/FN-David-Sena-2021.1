upper [] = []
upper (x : xs)
  | x `elem` ['A'..'Z'] = x : upper xs
  | x `elem` ['a'..'z'] = [z | (y,z) <- zip ['a' .. 'z'] ['A' .. 'Z'], y == x] ++ upper xs
  | otherwise = x : upper xs

main = do
    a <- getLine
    print $ upper a