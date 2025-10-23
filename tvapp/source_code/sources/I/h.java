package I;

import Z2.AbstractC0156a;
import Z2.C0162g;
import android.util.SparseBooleanArray;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import v4.C1331i;
import v4.InterfaceC1332j;
/* loaded from: classes.dex */
public final class h implements InterfaceC1332j {

    /* renamed from: a  reason: collision with root package name */
    public boolean f1200a;

    /* renamed from: b  reason: collision with root package name */
    public final Object f1201b;

    public h() {
        this.f1201b = new SparseBooleanArray();
    }

    @Override // v4.InterfaceC1332j
    public void a(C1331i c1331i, int i7) {
        boolean z7 = this.f1200a;
        StringBuilder sb = (StringBuilder) this.f1201b;
        if (z7) {
            this.f1200a = false;
        } else {
            sb.append(", ");
        }
        sb.append(i7);
    }

    public void b(int i7) {
        AbstractC0156a.k(!this.f1200a);
        ((SparseBooleanArray) this.f1201b).append(i7, true);
    }

    public C0162g c() {
        AbstractC0156a.k(!this.f1200a);
        this.f1200a = true;
        return new C0162g((SparseBooleanArray) this.f1201b);
    }

    public boolean d() {
        return this.f1200a;
    }

    public boolean e(int i7, CharSequence charSequence) {
        if (charSequence != null && i7 >= 0 && charSequence.length() - i7 >= 0) {
            g gVar = (g) this.f1201b;
            if (gVar == null) {
                return d();
            }
            int a7 = gVar.a(i7, charSequence);
            if (a7 == 0) {
                return true;
            }
            if (a7 != 1) {
                return d();
            }
            return false;
        }
        throw new IllegalArgumentException();
    }

    public h(g gVar, boolean z7) {
        this.f1201b = gVar;
        this.f1200a = z7;
    }

    public h(BottomSheetBehavior bottomSheetBehavior, boolean z7) {
        this.f1201b = bottomSheetBehavior;
        this.f1200a = z7;
    }

    public /* synthetic */ h(Object obj) {
        this.f1201b = obj;
        this.f1200a = true;
    }
}
