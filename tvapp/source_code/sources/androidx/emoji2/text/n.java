package androidx.emoji2.text;

import android.util.SparseArray;
import java.nio.ByteBuffer;
/* loaded from: classes.dex */
public final class n {

    /* renamed from: a  reason: collision with root package name */
    public int f5853a;

    /* renamed from: b  reason: collision with root package name */
    public int f5854b;

    /* renamed from: c  reason: collision with root package name */
    public int f5855c;
    public final Object d;

    /* renamed from: e  reason: collision with root package name */
    public Object f5856e;
    public Object f;

    public n(q qVar) {
        this.f5853a = 1;
        this.d = qVar;
        this.f5856e = qVar;
    }

    public int a(int i7) {
        q qVar;
        SparseArray sparseArray = ((q) this.f5856e).f5863a;
        if (sparseArray == null) {
            qVar = null;
        } else {
            qVar = (q) sparseArray.get(i7);
        }
        int i8 = 1;
        int i9 = 2;
        if (this.f5853a != 2) {
            if (qVar != null) {
                this.f5853a = 2;
                this.f5856e = qVar;
                this.f5855c = 1;
                i8 = i9;
            }
            b();
        } else {
            if (qVar != null) {
                this.f5856e = qVar;
                this.f5855c++;
            } else {
                if (i7 != 65038) {
                    if (i7 != 65039) {
                        q qVar2 = (q) this.f5856e;
                        if (qVar2.f5864b != null) {
                            i9 = 3;
                            if (this.f5855c == 1) {
                                if (c()) {
                                    qVar2 = (q) this.f5856e;
                                }
                            }
                            this.f = qVar2;
                            b();
                        }
                    }
                }
                b();
            }
            i8 = i9;
        }
        this.f5854b = i7;
        return i8;
    }

    public void b() {
        this.f5853a = 1;
        this.f5856e = (q) this.d;
        this.f5855c = 0;
    }

    public boolean c() {
        Z.a c5 = ((q) this.f5856e).f5864b.c();
        int a7 = c5.a(6);
        if ((a7 != 0 && ((ByteBuffer) c5.f295t).get(a7 + c5.f292q) != 0) || this.f5854b == 65039) {
            return true;
        }
        return false;
    }

    public n(h5.d dVar) {
        this.d = dVar;
        this.f5854b = 1;
        this.f = g5.c.f10846s;
        this.f5855c = -1;
    }
}
