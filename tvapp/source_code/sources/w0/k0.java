package w0;

import android.util.Log;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
/* loaded from: classes.dex */
public abstract class k0 {

    /* renamed from: t  reason: collision with root package name */
    public static final List f15575t = Collections.emptyList();

    /* renamed from: a  reason: collision with root package name */
    public final View f15576a;

    /* renamed from: b  reason: collision with root package name */
    public WeakReference f15577b;

    /* renamed from: j  reason: collision with root package name */
    public int f15583j;

    /* renamed from: r  reason: collision with root package name */
    public RecyclerView f15590r;

    /* renamed from: s  reason: collision with root package name */
    public L f15591s;

    /* renamed from: c  reason: collision with root package name */
    public int f15578c = -1;
    public int d = -1;

    /* renamed from: e  reason: collision with root package name */
    public long f15579e = -1;
    public int f = -1;

    /* renamed from: g  reason: collision with root package name */
    public int f15580g = -1;

    /* renamed from: h  reason: collision with root package name */
    public k0 f15581h = null;

    /* renamed from: i  reason: collision with root package name */
    public k0 f15582i = null;

    /* renamed from: k  reason: collision with root package name */
    public ArrayList f15584k = null;

    /* renamed from: l  reason: collision with root package name */
    public List f15585l = null;

    /* renamed from: m  reason: collision with root package name */
    public int f15586m = 0;
    public a0 n = null;

    /* renamed from: o  reason: collision with root package name */
    public boolean f15587o = false;

    /* renamed from: p  reason: collision with root package name */
    public int f15588p = 0;

    /* renamed from: q  reason: collision with root package name */
    public int f15589q = -1;

    public k0(View view) {
        if (view != null) {
            this.f15576a = view;
            return;
        }
        throw new IllegalArgumentException("itemView may not be null");
    }

    public final void b(Object obj) {
        if (obj == null) {
            c(1024);
        } else if ((1024 & this.f15583j) == 0) {
            if (this.f15584k == null) {
                ArrayList arrayList = new ArrayList();
                this.f15584k = arrayList;
                this.f15585l = Collections.unmodifiableList(arrayList);
            }
            this.f15584k.add(obj);
        }
    }

    public final void c(int i7) {
        this.f15583j = i7 | this.f15583j;
    }

    public final int d() {
        RecyclerView recyclerView = this.f15590r;
        if (recyclerView == null) {
            return -1;
        }
        return recyclerView.J(this);
    }

    public final int e() {
        RecyclerView recyclerView;
        L adapter;
        int J6;
        if (this.f15591s == null || (recyclerView = this.f15590r) == null || (adapter = recyclerView.getAdapter()) == null || (J6 = this.f15590r.J(this)) == -1 || this.f15591s != adapter) {
            return -1;
        }
        return J6;
    }

    public final int f() {
        int i7 = this.f15580g;
        if (i7 == -1) {
            return this.f15578c;
        }
        return i7;
    }

    public final List g() {
        ArrayList arrayList;
        int i7 = this.f15583j & 1024;
        List list = f15575t;
        if (i7 == 0 && (arrayList = this.f15584k) != null && arrayList.size() != 0) {
            return this.f15585l;
        }
        return list;
    }

    public final boolean h(int i7) {
        if ((i7 & this.f15583j) != 0) {
            return true;
        }
        return false;
    }

    public final boolean i() {
        View view = this.f15576a;
        if (view.getParent() != null && view.getParent() != this.f15590r) {
            return true;
        }
        return false;
    }

    public final boolean j() {
        if ((this.f15583j & 1) != 0) {
            return true;
        }
        return false;
    }

    public final boolean k() {
        if ((this.f15583j & 4) != 0) {
            return true;
        }
        return false;
    }

    public final boolean l() {
        if ((this.f15583j & 16) == 0) {
            Field field = K.O.f1447a;
            if (!this.f15576a.hasTransientState()) {
                return true;
            }
        }
        return false;
    }

    public final boolean m() {
        if ((this.f15583j & 8) != 0) {
            return true;
        }
        return false;
    }

    public final boolean n() {
        if (this.n != null) {
            return true;
        }
        return false;
    }

    public final boolean o() {
        if ((this.f15583j & 256) != 0) {
            return true;
        }
        return false;
    }

    public final boolean p() {
        if ((this.f15583j & 2) != 0) {
            return true;
        }
        return false;
    }

    public final void q(int i7, boolean z7) {
        if (this.d == -1) {
            this.d = this.f15578c;
        }
        if (this.f15580g == -1) {
            this.f15580g = this.f15578c;
        }
        if (z7) {
            this.f15580g += i7;
        }
        this.f15578c += i7;
        View view = this.f15576a;
        if (view.getLayoutParams() != null) {
            ((V) view.getLayoutParams()).f15492c = true;
        }
    }

    public final void r() {
        if (RecyclerView.f6880T0 && o()) {
            throw new IllegalStateException("Attempting to reset temp-detached ViewHolder: " + this + ". ViewHolders should be fully detached before resetting.");
        }
        this.f15583j = 0;
        this.f15578c = -1;
        this.d = -1;
        this.f15579e = -1L;
        this.f15580g = -1;
        this.f15586m = 0;
        this.f15581h = null;
        this.f15582i = null;
        ArrayList arrayList = this.f15584k;
        if (arrayList != null) {
            arrayList.clear();
        }
        this.f15583j &= -1025;
        this.f15588p = 0;
        this.f15589q = -1;
        RecyclerView.k(this);
    }

    public final void s(boolean z7) {
        int i7;
        int i8;
        int i9 = this.f15586m;
        if (z7) {
            i7 = i9 - 1;
        } else {
            i7 = i9 + 1;
        }
        this.f15586m = i7;
        if (i7 < 0) {
            this.f15586m = 0;
            if (!RecyclerView.f6880T0) {
                Log.e("View", "isRecyclable decremented below 0: unmatched pair of setIsRecyable() calls for " + this);
            } else {
                throw new RuntimeException("isRecyclable decremented below 0: unmatched pair of setIsRecyable() calls for " + this);
            }
        } else {
            if (!z7 && i7 == 1) {
                i8 = this.f15583j | 16;
            } else if (z7 && i7 == 0) {
                i8 = this.f15583j & (-17);
            }
            this.f15583j = i8;
        }
        if (RecyclerView.U0) {
            Log.d("RecyclerView", "setIsRecyclable val:" + z7 + ":" + this);
        }
    }

    public final boolean t() {
        if ((this.f15583j & 128) != 0) {
            return true;
        }
        return false;
    }

    public final String toString() {
        String simpleName;
        String str;
        if (getClass().isAnonymousClass()) {
            simpleName = "ViewHolder";
        } else {
            simpleName = getClass().getSimpleName();
        }
        StringBuilder sb = new StringBuilder(simpleName + "{" + Integer.toHexString(hashCode()) + " position=" + this.f15578c + " id=" + this.f15579e + ", oldPos=" + this.d + ", pLpos:" + this.f15580g);
        if (n()) {
            sb.append(" scrap ");
            if (this.f15587o) {
                str = "[changeScrap]";
            } else {
                str = "[attachedScrap]";
            }
            sb.append(str);
        }
        if (k()) {
            sb.append(" invalid");
        }
        if (!j()) {
            sb.append(" unbound");
        }
        if ((this.f15583j & 2) != 0) {
            sb.append(" update");
        }
        if (m()) {
            sb.append(" removed");
        }
        if (t()) {
            sb.append(" ignored");
        }
        if (o()) {
            sb.append(" tmpDetached");
        }
        if (!l()) {
            sb.append(" not recyclable(" + this.f15586m + ")");
        }
        if ((this.f15583j & 512) != 0 || k()) {
            sb.append(" undefined adapter position");
        }
        if (this.f15576a.getParent() == null) {
            sb.append(" no parent");
        }
        sb.append("}");
        return sb.toString();
    }

    public final boolean u() {
        if ((this.f15583j & 32) != 0) {
            return true;
        }
        return false;
    }
}
