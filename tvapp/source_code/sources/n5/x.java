package n5;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;
/* loaded from: classes.dex */
public final class x {

    /* renamed from: a  reason: collision with root package name */
    public final ArrayList f12756a = new ArrayList();

    /* renamed from: b  reason: collision with root package name */
    public final ArrayDeque f12757b = new ArrayDeque();

    /* renamed from: c  reason: collision with root package name */
    public boolean f12758c;
    public final /* synthetic */ y d;

    public x(y yVar) {
        this.d = yVar;
    }

    public final IllegalArgumentException a(IllegalArgumentException illegalArgumentException) {
        if (this.f12758c) {
            return illegalArgumentException;
        }
        this.f12758c = true;
        ArrayDeque arrayDeque = this.f12757b;
        if (arrayDeque.size() == 1 && ((w) arrayDeque.getFirst()).f12754b == null) {
            return illegalArgumentException;
        }
        StringBuilder sb = new StringBuilder(illegalArgumentException.getMessage());
        Iterator descendingIterator = arrayDeque.descendingIterator();
        while (descendingIterator.hasNext()) {
            w wVar = (w) descendingIterator.next();
            sb.append("\nfor ");
            sb.append(wVar.f12753a);
            String str = wVar.f12754b;
            if (str != null) {
                sb.append(' ');
                sb.append(str);
            }
        }
        return new IllegalArgumentException(sb.toString(), illegalArgumentException);
    }

    public final void b(boolean z7) {
        this.f12757b.removeLast();
        if (!this.f12757b.isEmpty()) {
            return;
        }
        this.d.f12760b.remove();
        if (z7) {
            synchronized (this.d.f12761c) {
                try {
                    int size = this.f12756a.size();
                    for (int i7 = 0; i7 < size; i7++) {
                        w wVar = (w) this.f12756a.get(i7);
                        k kVar = (k) this.d.f12761c.put(wVar.f12755c, wVar.d);
                        if (kVar != null) {
                            wVar.d = kVar;
                            this.d.f12761c.put(wVar.f12755c, kVar);
                        }
                    }
                } finally {
                }
            }
        }
    }
}
