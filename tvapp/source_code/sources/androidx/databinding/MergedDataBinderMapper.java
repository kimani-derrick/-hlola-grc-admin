package androidx.databinding;

import android.util.Log;
import android.view.View;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
/* loaded from: classes.dex */
public class MergedDataBinderMapper extends a {

    /* renamed from: a  reason: collision with root package name */
    public final HashSet f5652a = new HashSet();

    /* renamed from: b  reason: collision with root package name */
    public final CopyOnWriteArrayList f5653b = new CopyOnWriteArrayList();

    /* renamed from: c  reason: collision with root package name */
    public final CopyOnWriteArrayList f5654c = new CopyOnWriteArrayList();

    @Override // androidx.databinding.a
    public final d b(View view, int i7) {
        Iterator it = this.f5653b.iterator();
        while (it.hasNext()) {
            d b7 = ((a) it.next()).b(view, i7);
            if (b7 != null) {
                return b7;
            }
        }
        if (f()) {
            return b(view, i7);
        }
        return null;
    }

    @Override // androidx.databinding.a
    public final d c(View[] viewArr, int i7) {
        Iterator it = this.f5653b.iterator();
        while (it.hasNext()) {
            d c5 = ((a) it.next()).c(viewArr, i7);
            if (c5 != null) {
                return c5;
            }
        }
        if (f()) {
            return c(viewArr, i7);
        }
        return null;
    }

    @Override // androidx.databinding.a
    public final int d(String str) {
        Iterator it = this.f5653b.iterator();
        while (it.hasNext()) {
            int d = ((a) it.next()).d(str);
            if (d != 0) {
                return d;
            }
        }
        if (f()) {
            return d(str);
        }
        return 0;
    }

    public final void e(a aVar) {
        if (this.f5652a.add(aVar.getClass())) {
            this.f5653b.add(aVar);
            for (a aVar2 : aVar.a()) {
                e(aVar2);
            }
        }
    }

    public final boolean f() {
        StringBuilder sb;
        CopyOnWriteArrayList copyOnWriteArrayList = this.f5654c;
        Iterator it = copyOnWriteArrayList.iterator();
        boolean z7 = false;
        while (it.hasNext()) {
            String str = (String) it.next();
            try {
                Class<?> cls = Class.forName(str);
                if (a.class.isAssignableFrom(cls)) {
                    e((a) cls.newInstance());
                    copyOnWriteArrayList.remove(str);
                    z7 = true;
                }
            } catch (ClassNotFoundException unused) {
            } catch (IllegalAccessException e3) {
                e = e3;
                sb = new StringBuilder("unable to add feature mapper for ");
                sb.append(str);
                Log.e("MergedDataBinderMapper", sb.toString(), e);
            } catch (InstantiationException e7) {
                e = e7;
                sb = new StringBuilder("unable to add feature mapper for ");
                sb.append(str);
                Log.e("MergedDataBinderMapper", sb.toString(), e);
            }
        }
        return z7;
    }
}
