package com.google.android.gms.internal.measurement;

import r0.AbstractC1111a;
/* loaded from: classes.dex */
public final class G0 implements InterfaceC0477q2 {

    /* renamed from: b  reason: collision with root package name */
    public static final G0 f8332b = new G0(0);

    /* renamed from: c  reason: collision with root package name */
    public static final G0 f8333c = new G0(1);
    public static final G0 d = new G0(2);

    /* renamed from: e  reason: collision with root package name */
    public static final G0 f8334e = new G0(3);
    public static final G0 f = new G0(4);

    /* renamed from: g  reason: collision with root package name */
    public static final G0 f8335g = new G0(5);

    /* renamed from: h  reason: collision with root package name */
    public static final G0 f8336h = new G0(6);

    /* renamed from: i  reason: collision with root package name */
    public static final G0 f8337i = new G0(7);

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f8338a;

    public /* synthetic */ G0(int i7) {
        this.f8338a = i7;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC0477q2
    public final boolean d(int i7) {
        switch (this.f8338a) {
            case 0:
                if (AbstractC1111a.g(i7) != 0) {
                    return true;
                }
                return false;
            case 1:
                switch (i7) {
                    case 0:
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case X.i.STRING_SET_FIELD_NUMBER /* 6 */:
                        return true;
                    default:
                        return false;
                }
            case 2:
                if (i7 == 0 || i7 == 1 || i7 == 2) {
                    return true;
                }
                return false;
            case 3:
                if (AbstractC1111a.h(i7) != 0) {
                    return true;
                }
                return false;
            case 4:
                if (i7 == 0 || i7 == 1 || i7 == 2 || i7 == 3 || i7 == 4 || i7 == 5) {
                    return true;
                }
                return false;
            case 5:
                if (i7 == 0 || i7 == 1) {
                    return true;
                }
                return false;
            case X.i.STRING_SET_FIELD_NUMBER /* 6 */:
                if (i7 == 1 || i7 == 2) {
                    return true;
                }
                return false;
            default:
                if (AbstractC0515y1.a(i7) != 0) {
                    return true;
                }
                return false;
        }
    }
}
