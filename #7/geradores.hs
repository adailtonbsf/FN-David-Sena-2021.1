import Data.List ( unfoldr )

gerador1 = concat [[x,y] | (x,y) <- zip (iterate (+ 1 * (-1)) 0) [1..]]

gerador2 = concat [[x,y] | (x,y) <- zip [1,3..] [-2,-4..]]

gerador3 = [2^x | x <- [0..]] -- com list comprehension
gerador3' = map (2^) [0..] -- sem list comprehension

gerador4 x = takeWhile (> 0) $ iterate (`div` 2) x

gerador5 = unfoldr (\x -> if x > 0 then Just (x, x `div` 2) else Nothing)

digitos x = reverse $ unfoldr (\y -> if y `mod` 10 > 0 
                                        then Just (y `mod` 10, y `div` 10) 
                                        else Nothing) x