package K;

import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import com.boxhdo.android.tv.R;
import com.google.android.gms.internal.measurement.AbstractC0515y1;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.WeakHashMap;
/* loaded from: classes.dex */
public final class N {
    public static final ArrayList d = new ArrayList();

    /* renamed from: a  reason: collision with root package name */
    public WeakHashMap f1444a;

    /* renamed from: b  reason: collision with root package name */
    public SparseArray f1445b;

    /* renamed from: c  reason: collision with root package name */
    public WeakReference f1446c;

    public final View a(View view) {
        int size;
        WeakHashMap weakHashMap = this.f1444a;
        if (weakHashMap != null && weakHashMap.containsKey(view)) {
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                    View a7 = a(viewGroup.getChildAt(childCount));
                    if (a7 != null) {
                        return a7;
                    }
                }
            }
            ArrayList arrayList = (ArrayList) view.getTag(R.id.tag_unhandled_key_listeners);
            if (arrayList != null && arrayList.size() - 1 >= 0) {
                AbstractC0515y1.v(arrayList.get(size));
                throw null;
            }
        }
        return null;
    }
}
