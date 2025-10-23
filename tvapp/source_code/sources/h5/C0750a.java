package h5;
/* renamed from: h5.a  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0750a {

    /* renamed from: a  reason: collision with root package name */
    public int f11005a;

    /* renamed from: b  reason: collision with root package name */
    public int f11006b;

    /* renamed from: c  reason: collision with root package name */
    public int f11007c;
    public int d;

    /* renamed from: e  reason: collision with root package name */
    public int f11008e;
    public int f;

    /* renamed from: g  reason: collision with root package name */
    public int f11009g;

    public final boolean a(int i7, int i8) {
        boolean z7;
        boolean z8;
        int i9 = this.f11005a;
        int i10 = this.f11006b;
        if (i9 == i7 - 1 || i9 == i8 + 1 || (i10 + i9 >= i7 && i9 <= i8)) {
            return false;
        }
        int i11 = this.f11007c;
        if (this.d + i11 >= i7 && i11 <= i8) {
            return false;
        }
        int i12 = this.f11008e;
        int i13 = this.f11009g;
        if (i12 + i13 >= i7 && i12 <= i8) {
            z7 = false;
        } else {
            z7 = true;
        }
        int i14 = this.f;
        if (i13 + i14 >= i7 && i14 <= i8) {
            z8 = false;
        } else {
            z8 = true;
        }
        if (!z7 && !z8) {
            return false;
        }
        return true;
    }

    public final String toString() {
        return "ItemChanges(insertionPosition=" + this.f11005a + ", insertionItemCount=" + this.f11006b + ", removalPosition=" + this.f11007c + ", removalItemCount=" + this.d + ", moveFromPosition=" + this.f11008e + ", moveToPosition=" + this.f + ", moveItemCount=" + this.f11009g + ')';
    }
}
