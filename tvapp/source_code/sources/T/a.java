package T;

import K.O;
import K3.f;
import L.i;
import android.os.Bundle;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import com.google.android.material.chip.Chip;
import java.lang.reflect.Field;
/* loaded from: classes.dex */
public final class a extends f {

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ b f3165c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(b bVar) {
        super(2);
        this.f3165c = bVar;
    }

    @Override // K3.f
    public final i a(int i7) {
        return new i(AccessibilityNodeInfo.obtain(this.f3165c.n(i7).f1854a));
    }

    @Override // K3.f
    public final i b(int i7) {
        int i8;
        b bVar = this.f3165c;
        if (i7 == 2) {
            i8 = bVar.f3173k;
        } else {
            i8 = bVar.f3174l;
        }
        if (i8 == Integer.MIN_VALUE) {
            return null;
        }
        return a(i8);
    }

    @Override // K3.f
    public final boolean e(int i7, int i8, Bundle bundle) {
        int i9;
        b bVar = this.f3165c;
        View view = bVar.f3171i;
        if (i7 != -1) {
            boolean z7 = true;
            if (i8 != 1) {
                if (i8 != 2) {
                    boolean z8 = false;
                    if (i8 != 64) {
                        if (i8 != 128) {
                            B3.d dVar = (B3.d) bVar;
                            if (i8 != 16) {
                                return false;
                            }
                            Chip chip = dVar.f193q;
                            if (i7 == 0) {
                                return chip.performClick();
                            }
                            if (i7 != 1) {
                                return false;
                            }
                            chip.playSoundEffect(0);
                            View.OnClickListener onClickListener = chip.f8830x;
                            if (onClickListener != null) {
                                onClickListener.onClick(chip);
                                z8 = true;
                            }
                            chip.f8823G.q(1, 1);
                            return z8;
                        }
                        if (bVar.f3173k == i7) {
                            bVar.f3173k = Integer.MIN_VALUE;
                            view.invalidate();
                            bVar.q(i7, 65536);
                        }
                        z7 = false;
                    } else {
                        AccessibilityManager accessibilityManager = bVar.f3170h;
                        if (accessibilityManager.isEnabled() && accessibilityManager.isTouchExplorationEnabled() && (i9 = bVar.f3173k) != i7) {
                            if (i9 != Integer.MIN_VALUE) {
                                bVar.f3173k = Integer.MIN_VALUE;
                                bVar.f3171i.invalidate();
                                bVar.q(i9, 65536);
                            }
                            bVar.f3173k = i7;
                            view.invalidate();
                            bVar.q(i7, 32768);
                        }
                        z7 = false;
                    }
                    return z7;
                }
                return bVar.j(i7);
            }
            return bVar.p(i7);
        }
        Field field = O.f1447a;
        return view.performAccessibilityAction(i8, bundle);
    }
}
