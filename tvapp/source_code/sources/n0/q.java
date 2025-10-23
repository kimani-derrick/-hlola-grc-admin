package n0;

import androidx.fragment.app.U;
import androidx.lifecycle.V;
import androidx.lifecycle.b0;
import java.util.Iterator;
import java.util.LinkedHashMap;
/* loaded from: classes.dex */
public final class q extends V {

    /* renamed from: e  reason: collision with root package name */
    public static final U f12578e = new U(2);
    public final LinkedHashMap d = new LinkedHashMap();

    @Override // androidx.lifecycle.V
    public final void b() {
        LinkedHashMap linkedHashMap = this.d;
        for (b0 b0Var : linkedHashMap.values()) {
            b0Var.a();
        }
        linkedHashMap.clear();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("NavControllerViewModel{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("} ViewModelStores (");
        Iterator it = this.d.keySet().iterator();
        while (it.hasNext()) {
            sb.append((String) it.next());
            if (it.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(')');
        String sb2 = sb.toString();
        M5.g.e(sb2, "sb.toString()");
        return sb2;
    }
}
