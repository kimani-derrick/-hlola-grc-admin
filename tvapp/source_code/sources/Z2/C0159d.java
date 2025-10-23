package Z2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
/* renamed from: Z2.d  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0159d implements Iterable {

    /* renamed from: q  reason: collision with root package name */
    public final Object f4622q = new Object();

    /* renamed from: r  reason: collision with root package name */
    public final HashMap f4623r = new HashMap();

    /* renamed from: s  reason: collision with root package name */
    public Set f4624s = Collections.emptySet();

    /* renamed from: t  reason: collision with root package name */
    public List f4625t = Collections.emptyList();

    public final int b(Object obj) {
        int i7;
        synchronized (this.f4622q) {
            try {
                if (this.f4623r.containsKey(obj)) {
                    i7 = ((Integer) this.f4623r.get(obj)).intValue();
                } else {
                    i7 = 0;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return i7;
    }

    public final void c(Object obj) {
        synchronized (this.f4622q) {
            try {
                Integer num = (Integer) this.f4623r.get(obj);
                if (num == null) {
                    return;
                }
                ArrayList arrayList = new ArrayList(this.f4625t);
                arrayList.remove(obj);
                this.f4625t = Collections.unmodifiableList(arrayList);
                if (num.intValue() == 1) {
                    this.f4623r.remove(obj);
                    HashSet hashSet = new HashSet(this.f4624s);
                    hashSet.remove(obj);
                    this.f4624s = Collections.unmodifiableSet(hashSet);
                } else {
                    this.f4623r.put(obj, Integer.valueOf(num.intValue() - 1));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        Iterator it;
        synchronized (this.f4622q) {
            it = this.f4625t.iterator();
        }
        return it;
    }
}
