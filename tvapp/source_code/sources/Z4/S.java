package Z4;

import android.os.Message;
import java.util.Comparator;
/* loaded from: classes.dex */
public final class S implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        Long valueOf = Long.valueOf(((Message) obj).getWhen());
        Long valueOf2 = Long.valueOf(((Message) obj2).getWhen());
        if (valueOf == valueOf2) {
            return 0;
        }
        return valueOf.compareTo(valueOf2);
    }
}
