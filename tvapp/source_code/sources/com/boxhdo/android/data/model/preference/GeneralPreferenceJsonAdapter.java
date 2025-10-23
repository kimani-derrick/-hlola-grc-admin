package com.boxhdo.android.data.model.preference;

import A5.v;
import M5.g;
import X.i;
import androidx.fragment.app.D;
import com.google.android.gms.internal.measurement.AbstractC0515y1;
import n5.k;
import n5.n;
import n5.q;
import n5.y;
import o5.e;
/* loaded from: classes.dex */
public final class GeneralPreferenceJsonAdapter extends k {

    /* renamed from: a  reason: collision with root package name */
    public final D f7302a;

    /* renamed from: b  reason: collision with root package name */
    public final k f7303b;

    /* renamed from: c  reason: collision with root package name */
    public final k f7304c;

    public GeneralPreferenceJsonAdapter(y yVar) {
        g.f(yVar, "moshi");
        this.f7302a = D.G("backgroundColor", "textColor", "paddingBottom", "textSize", "typeFace", "defaultQuality", "defaultResizeMode", "langCode");
        Class cls = Integer.TYPE;
        v vVar = v.f137q;
        this.f7303b = yVar.c(cls, vVar, "backgroundColor");
        this.f7304c = yVar.c(String.class, vVar, "langCode");
    }

    @Override // n5.k
    public final Object b(n nVar) {
        g.f(nVar, "reader");
        nVar.b();
        Integer num = null;
        Integer num2 = null;
        Integer num3 = null;
        Integer num4 = null;
        Integer num5 = null;
        Integer num6 = null;
        Integer num7 = null;
        String str = null;
        while (true) {
            Integer num8 = num7;
            Integer num9 = num6;
            if (nVar.n()) {
                int X6 = nVar.X(this.f7302a);
                Integer num10 = num5;
                k kVar = this.f7303b;
                switch (X6) {
                    case -1:
                        nVar.Y();
                        nVar.Z();
                        num7 = num8;
                        num6 = num9;
                        break;
                    case 0:
                        num = (Integer) kVar.b(nVar);
                        if (num == null) {
                            throw e.j("backgroundColor", "backgroundColor", nVar);
                        }
                        num7 = num8;
                        num6 = num9;
                        break;
                    case 1:
                        num2 = (Integer) kVar.b(nVar);
                        if (num2 == null) {
                            throw e.j("textColor", "textColor", nVar);
                        }
                        num7 = num8;
                        num6 = num9;
                        break;
                    case 2:
                        num3 = (Integer) kVar.b(nVar);
                        if (num3 == null) {
                            throw e.j("paddingBottom", "paddingBottom", nVar);
                        }
                        num7 = num8;
                        num6 = num9;
                        break;
                    case 3:
                        num4 = (Integer) kVar.b(nVar);
                        if (num4 == null) {
                            throw e.j("textSize", "textSize", nVar);
                        }
                        num7 = num8;
                        num6 = num9;
                        break;
                    case 4:
                        num5 = (Integer) kVar.b(nVar);
                        if (num5 != null) {
                            num7 = num8;
                            num6 = num9;
                            continue;
                        } else {
                            throw e.j("typeFace", "typeFace", nVar);
                        }
                    case 5:
                        num6 = (Integer) kVar.b(nVar);
                        if (num6 != null) {
                            num7 = num8;
                            break;
                        } else {
                            throw e.j("defaultQuality", "defaultQuality", nVar);
                        }
                    case i.STRING_SET_FIELD_NUMBER /* 6 */:
                        Integer num11 = (Integer) kVar.b(nVar);
                        if (num11 != null) {
                            num7 = num11;
                            num6 = num9;
                            break;
                        } else {
                            throw e.j("defaultResizeMode", "defaultResizeMode", nVar);
                        }
                    case i.DOUBLE_FIELD_NUMBER /* 7 */:
                        str = (String) this.f7304c.b(nVar);
                        if (str == null) {
                            throw e.j("langCode", "langCode", nVar);
                        }
                        num7 = num8;
                        num6 = num9;
                        break;
                    default:
                        num7 = num8;
                        num6 = num9;
                        break;
                }
                num5 = num10;
            } else {
                Integer num12 = num5;
                nVar.h();
                if (num != null) {
                    int intValue = num.intValue();
                    if (num2 != null) {
                        int intValue2 = num2.intValue();
                        if (num3 != null) {
                            int intValue3 = num3.intValue();
                            if (num4 != null) {
                                int intValue4 = num4.intValue();
                                if (num12 != null) {
                                    int intValue5 = num12.intValue();
                                    if (num9 != null) {
                                        int intValue6 = num9.intValue();
                                        if (num8 != null) {
                                            int intValue7 = num8.intValue();
                                            if (str != null) {
                                                return new GeneralPreference(intValue, intValue2, intValue3, intValue4, intValue5, intValue6, intValue7, str);
                                            }
                                            throw e.e("langCode", "langCode", nVar);
                                        }
                                        throw e.e("defaultResizeMode", "defaultResizeMode", nVar);
                                    }
                                    throw e.e("defaultQuality", "defaultQuality", nVar);
                                }
                                throw e.e("typeFace", "typeFace", nVar);
                            }
                            throw e.e("textSize", "textSize", nVar);
                        }
                        throw e.e("paddingBottom", "paddingBottom", nVar);
                    }
                    throw e.e("textColor", "textColor", nVar);
                }
                throw e.e("backgroundColor", "backgroundColor", nVar);
            }
        }
    }

    @Override // n5.k
    public final void f(q qVar, Object obj) {
        GeneralPreference generalPreference = (GeneralPreference) obj;
        g.f(qVar, "writer");
        if (generalPreference != null) {
            qVar.b();
            qVar.j("backgroundColor");
            Integer valueOf = Integer.valueOf(generalPreference.f7296a);
            k kVar = this.f7303b;
            kVar.f(qVar, valueOf);
            qVar.j("textColor");
            kVar.f(qVar, Integer.valueOf(generalPreference.f7297b));
            qVar.j("paddingBottom");
            kVar.f(qVar, Integer.valueOf(generalPreference.f7298c));
            qVar.j("textSize");
            kVar.f(qVar, Integer.valueOf(generalPreference.d));
            qVar.j("typeFace");
            kVar.f(qVar, Integer.valueOf(generalPreference.f7299e));
            qVar.j("defaultQuality");
            kVar.f(qVar, Integer.valueOf(generalPreference.f));
            qVar.j("defaultResizeMode");
            kVar.f(qVar, Integer.valueOf(generalPreference.f7300g));
            qVar.j("langCode");
            this.f7304c.f(qVar, generalPreference.f7301h);
            qVar.f();
            return;
        }
        throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
    }

    public final String toString() {
        return AbstractC0515y1.j(39, "GeneratedJsonAdapter(GeneralPreference)", "StringBuilder(capacity).…builderAction).toString()");
    }
}
