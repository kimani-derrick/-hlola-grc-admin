package s2;

import i2.AbstractC0769a;
import java.util.ArrayList;
import java.util.Arrays;
/* renamed from: s2.a  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1145a extends AbstractC0769a {

    /* renamed from: s  reason: collision with root package name */
    public final long f13579s;

    /* renamed from: t  reason: collision with root package name */
    public final ArrayList f13580t;

    /* renamed from: u  reason: collision with root package name */
    public final ArrayList f13581u;

    public C1145a(long j7, int i7) {
        super(i7);
        this.f13579s = j7;
        this.f13580t = new ArrayList();
        this.f13581u = new ArrayList();
    }

    public final C1145a f(int i7) {
        ArrayList arrayList = this.f13581u;
        int size = arrayList.size();
        for (int i8 = 0; i8 < size; i8++) {
            C1145a c1145a = (C1145a) arrayList.get(i8);
            if (c1145a.f11331r == i7) {
                return c1145a;
            }
        }
        return null;
    }

    public final b g(int i7) {
        ArrayList arrayList = this.f13580t;
        int size = arrayList.size();
        for (int i8 = 0; i8 < size; i8++) {
            b bVar = (b) arrayList.get(i8);
            if (bVar.f11331r == i7) {
                return bVar;
            }
        }
        return null;
    }

    @Override // i2.AbstractC0769a
    public final String toString() {
        return AbstractC0769a.c(this.f11331r) + " leaves: " + Arrays.toString(this.f13580t.toArray()) + " containers: " + Arrays.toString(this.f13581u.toArray());
    }
}
