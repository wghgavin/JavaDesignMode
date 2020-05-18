package FlyWeightMode;

import FlyWeightMode.impl.BlackChess;
import FlyWeightMode.impl.WhiteChess;

import java.util.Hashtable;

/**
 * 亨元工厂
 */
public class ChessFactory {
    private Hashtable<String,BaseChess> sets=new Hashtable<>();
    private volatile static ChessFactory instance;
    private ChessFactory(){}
    public static ChessFactory getInstance(){
        if(instance==null){
            synchronized (ChessFactory.class){
                if(instance==null){
                    instance=new ChessFactory();
                }
            }
        }
        return instance;
    }
    public  BaseChess getChess(String key){
        if(sets.containsKey(key)){
            return sets.get(key);
        }
        else {
            BaseChess chess =(key=="w"?new WhiteChess():new BlackChess());
            sets.put(key,chess);
            return chess;
        }
    }
}
