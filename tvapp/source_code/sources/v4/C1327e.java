package v4;

import z4.C1518b;
/* renamed from: v4.e  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1327e implements InterfaceC1332j {

    /* renamed from: c  reason: collision with root package name */
    public static final u0.j f15331c = new Object();

    /* renamed from: a  reason: collision with root package name */
    public final Object f15332a;

    /* renamed from: b  reason: collision with root package name */
    public Object f15333b;

    public C1327e(C1518b c1518b) {
        this.f15332a = c1518b;
        this.f15333b = f15331c;
    }

    @Override // v4.InterfaceC1332j
    public void a(C1331i c1331i, int i7) {
        int[] iArr = (int[]) this.f15333b;
        try {
            c1331i.read((byte[]) this.f15332a, iArr[0], i7);
            iArr[0] = iArr[0] + i7;
        } finally {
            c1331i.close();
        }
    }

    public C1327e(byte[] bArr, int[] iArr) {
        this.f15332a = bArr;
        this.f15333b = iArr;
    }
}
