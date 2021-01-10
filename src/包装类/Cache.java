package 包装类;

public class Cache<a> {

    public static void main(String[] args) {
        //cache between [-128,127] number
        Integer a = Integer.valueOf(-128);
        Integer b = -128;
        System.out.println(a==b);//true
        System.out.println(a.equals(b));//true


        Integer c = 1234;
        Integer d = 1234;
        System.out.println(c==d);//false
        System.out.println(c.equals(d));//true

        //because :

//        public static Integer valueOf(int i) {
//            if (i >= Integer.IntegerCache.low && i <= Integer.IntegerCache.high)  -  -->  cache between [Integer.IntegerCache.low,Integer.IntegerCache.high] number
//                return Integer.IntegerCache.cache[i + (-Integer.IntegerCache.low)]; --->  if cache else return not build new object
//            return new Integer(i);
//        }


//        private static class IntegerCache {
//            static final int low = -128;  ---> define Integer.IntegerCache.low
//            static final int high;
//            static final Integer cache[];
//
//            static {  ----------------------> define Integer.IntegerCache.high
//                // high value may be configured by property
//                int h = 127;
//                String integerCacheHighPropValue =
//                        sun.misc.VM.getSavedProperty("java.lang.Integer.IntegerCache.high");
//                if (integerCacheHighPropValue != null) {
//                    try {
//                        int i = parseInt(integerCacheHighPropValue);
//                        i = Math.max(i, 127);
//                        // Maximum array size is Integer.MAX_VALUE
//                        h = Math.min(i, Integer.MAX_VALUE - (-low) -1);
//                    } catch( NumberFormatException nfe) {
//                        // If the property cannot be parsed into an int, ignore it.
//                    }
//                }
//                high = h;
//
//                cache = new Integer[(high - low) + 1];
//                int j = low;
//                for(int k = 0; k < cache.length; k++)
//                    cache[k] = new Integer(j++);
//
//                // range [-128, 127] must be interned (JLS7 5.1.7)
//                assert Integer.IntegerCache.high >= 127;
//            }
//
//            private IntegerCache() {}
//        }



    }

}
