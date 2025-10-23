package androidx.activity;

import android.content.Intent;
import android.content.IntentSender;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import java.util.Arrays;
import java.util.HashSet;
import r0.AbstractC1111a;
import z.AbstractC1497a;
import z.InterfaceC1498b;
/* loaded from: classes.dex */
public final class h extends androidx.activity.result.g {

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ l f5317h;

    public h(q1.g gVar) {
        this.f5317h = gVar;
    }

    @Override // androidx.activity.result.g
    public final void b(int i7, p6.l lVar, Object obj) {
        Bundle bundle;
        String[] strArr;
        l lVar2 = this.f5317h;
        K3.f x7 = lVar.x(lVar2, obj);
        if (x7 != null) {
            new Handler(Looper.getMainLooper()).post(new g(this, i7, x7, 0));
            return;
        }
        Intent n = lVar.n(lVar2, obj);
        if (n.getExtras() != null && n.getExtras().getClassLoader() == null) {
            n.setExtrasClassLoader(lVar2.getClassLoader());
        }
        if (n.hasExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE")) {
            Bundle bundleExtra = n.getBundleExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
            n.removeExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
            bundle = bundleExtra;
        } else {
            bundle = null;
        }
        if ("androidx.activity.result.contract.action.REQUEST_PERMISSIONS".equals(n.getAction())) {
            String[] stringArrayExtra = n.getStringArrayExtra("androidx.activity.result.contract.extra.PERMISSIONS");
            if (stringArrayExtra == null) {
                stringArrayExtra = new String[0];
            }
            HashSet hashSet = new HashSet();
            for (int i8 = 0; i8 < stringArrayExtra.length; i8++) {
                if (!TextUtils.isEmpty(stringArrayExtra[i8])) {
                    if (Build.VERSION.SDK_INT < 33 && TextUtils.equals(stringArrayExtra[i8], "android.permission.POST_NOTIFICATIONS")) {
                        hashSet.add(Integer.valueOf(i8));
                    }
                } else {
                    throw new IllegalArgumentException(AbstractC1111a.t(new StringBuilder("Permission request for permissions "), Arrays.toString(stringArrayExtra), " must not contain null or empty values"));
                }
            }
            int size = hashSet.size();
            if (size > 0) {
                strArr = new String[stringArrayExtra.length - size];
            } else {
                strArr = stringArrayExtra;
            }
            if (size > 0) {
                if (size != stringArrayExtra.length) {
                    int i9 = 0;
                    for (int i10 = 0; i10 < stringArrayExtra.length; i10++) {
                        if (!hashSet.contains(Integer.valueOf(i10))) {
                            strArr[i9] = stringArrayExtra[i10];
                            i9++;
                        }
                    }
                } else {
                    return;
                }
            }
            if (lVar2 instanceof InterfaceC1498b) {
                ((InterfaceC1498b) lVar2).getClass();
            }
            AbstractC1497a.b(lVar2, stringArrayExtra, i7);
        } else if ("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST".equals(n.getAction())) {
            androidx.activity.result.i iVar = (androidx.activity.result.i) n.getParcelableExtra("androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST");
            try {
                lVar2.startIntentSenderForResult(iVar.f5370q, i7, iVar.f5371r, iVar.f5372s, iVar.f5373t, 0, bundle);
            } catch (IntentSender.SendIntentException e3) {
                new Handler(Looper.getMainLooper()).post(new g(this, i7, e3, 1));
            }
        } else {
            lVar2.startActivityForResult(n, i7, bundle);
        }
    }
}
