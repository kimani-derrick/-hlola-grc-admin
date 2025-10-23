package com.boxhdo.android.data.model.response;

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
public final class UserResponseJsonAdapter extends k {

    /* renamed from: a  reason: collision with root package name */
    public final D f7701a;

    /* renamed from: b  reason: collision with root package name */
    public final k f7702b;

    /* renamed from: c  reason: collision with root package name */
    public final k f7703c;
    public final k d;

    /* renamed from: e  reason: collision with root package name */
    public final k f7704e;
    public final k f;

    public UserResponseJsonAdapter(y yVar) {
        g.f(yVar, "moshi");
        this.f7701a = D.G("id", "name", "email", "status", "country", "is_email_verified", "avatar");
        Class cls = Long.TYPE;
        v vVar = v.f137q;
        this.f7702b = yVar.c(cls, vVar, "id");
        this.f7703c = yVar.c(String.class, vVar, "name");
        this.d = yVar.c(Integer.TYPE, vVar, "status");
        this.f7704e = yVar.c(String.class, vVar, "country");
        this.f = yVar.c(AvatarResponse.class, vVar, "avatar");
    }

    @Override // n5.k
    public final Object b(n nVar) {
        g.f(nVar, "reader");
        nVar.b();
        Long l7 = null;
        Integer num = null;
        Integer num2 = null;
        String str = null;
        String str2 = null;
        String str3 = null;
        AvatarResponse avatarResponse = null;
        while (nVar.n()) {
            int X6 = nVar.X(this.f7701a);
            AvatarResponse avatarResponse2 = avatarResponse;
            k kVar = this.f7703c;
            String str4 = str3;
            k kVar2 = this.d;
            switch (X6) {
                case -1:
                    nVar.Y();
                    nVar.Z();
                    avatarResponse = avatarResponse2;
                    break;
                case 0:
                    l7 = (Long) this.f7702b.b(nVar);
                    if (l7 == null) {
                        throw e.j("id", "id", nVar);
                    }
                    avatarResponse = avatarResponse2;
                    break;
                case 1:
                    str = (String) kVar.b(nVar);
                    if (str == null) {
                        throw e.j("name", "name", nVar);
                    }
                    avatarResponse = avatarResponse2;
                    break;
                case 2:
                    str2 = (String) kVar.b(nVar);
                    if (str2 == null) {
                        throw e.j("email", "email", nVar);
                    }
                    avatarResponse = avatarResponse2;
                    break;
                case 3:
                    num = (Integer) kVar2.b(nVar);
                    if (num == null) {
                        throw e.j("status", "status", nVar);
                    }
                    avatarResponse = avatarResponse2;
                    break;
                case 4:
                    str3 = (String) this.f7704e.b(nVar);
                    avatarResponse = avatarResponse2;
                    continue;
                case 5:
                    num2 = (Integer) kVar2.b(nVar);
                    if (num2 == null) {
                        throw e.j("isEmailVerified", "is_email_verified", nVar);
                    }
                    avatarResponse = avatarResponse2;
                    break;
                case i.STRING_SET_FIELD_NUMBER /* 6 */:
                    avatarResponse = (AvatarResponse) this.f.b(nVar);
                    break;
                default:
                    avatarResponse = avatarResponse2;
                    break;
            }
            str3 = str4;
        }
        String str5 = str3;
        AvatarResponse avatarResponse3 = avatarResponse;
        nVar.h();
        if (l7 != null) {
            long longValue = l7.longValue();
            if (str != null) {
                if (str2 != null) {
                    if (num != null) {
                        int intValue = num.intValue();
                        if (num2 != null) {
                            return new UserResponse(longValue, str, str2, intValue, str5, num2.intValue(), avatarResponse3);
                        }
                        throw e.e("isEmailVerified", "is_email_verified", nVar);
                    }
                    throw e.e("status", "status", nVar);
                }
                throw e.e("email", "email", nVar);
            }
            throw e.e("name", "name", nVar);
        }
        throw e.e("id", "id", nVar);
    }

    @Override // n5.k
    public final void f(q qVar, Object obj) {
        UserResponse userResponse = (UserResponse) obj;
        g.f(qVar, "writer");
        if (userResponse != null) {
            qVar.b();
            qVar.j("id");
            this.f7702b.f(qVar, Long.valueOf(userResponse.f7696a));
            qVar.j("name");
            k kVar = this.f7703c;
            kVar.f(qVar, userResponse.f7697b);
            qVar.j("email");
            kVar.f(qVar, userResponse.f7698c);
            qVar.j("status");
            Integer valueOf = Integer.valueOf(userResponse.d);
            k kVar2 = this.d;
            kVar2.f(qVar, valueOf);
            qVar.j("country");
            this.f7704e.f(qVar, userResponse.f7699e);
            qVar.j("is_email_verified");
            kVar2.f(qVar, Integer.valueOf(userResponse.f));
            qVar.j("avatar");
            this.f.f(qVar, userResponse.f7700g);
            qVar.f();
            return;
        }
        throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
    }

    public final String toString() {
        return AbstractC0515y1.j(34, "GeneratedJsonAdapter(UserResponse)", "StringBuilder(capacity).…builderAction).toString()");
    }
}
