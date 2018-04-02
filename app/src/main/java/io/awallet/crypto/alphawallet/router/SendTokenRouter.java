package io.awallet.crypto.alphawallet.router;


import android.content.Context;
import android.content.Intent;

import io.awallet.crypto.alphawallet.C;
import io.awallet.crypto.alphawallet.entity.Token;
import io.awallet.crypto.alphawallet.entity.Wallet;
import io.awallet.crypto.alphawallet.ui.SendActivity;

import static io.awallet.crypto.alphawallet.C.Key.WALLET;

public class SendTokenRouter {
    public void open(Context context, String address, String symbol, int decimals, boolean isToken) {
        Intent intent = new Intent(context, SendActivity.class);
        intent.putExtra(C.EXTRA_SENDING_TOKENS, isToken);
        intent.putExtra(C.EXTRA_CONTRACT_ADDRESS, address);
        intent.putExtra(C.EXTRA_SYMBOL, symbol);
        intent.putExtra(C.EXTRA_DECIMALS, decimals);
        context.startActivity(intent);
    }

    public void open(Context context, String address, String symbol, int decimals, boolean isToken, Wallet wallet, Token token) {
        Intent intent = new Intent(context, SendActivity.class);
        intent.putExtra(C.EXTRA_SENDING_TOKENS, isToken);
        intent.putExtra(C.EXTRA_CONTRACT_ADDRESS, address);
        intent.putExtra(C.EXTRA_SYMBOL, symbol);
        intent.putExtra(C.EXTRA_DECIMALS, decimals);
        intent.putExtra(WALLET, wallet);
        intent.putExtra(C.EXTRA_TOKEN_ID, token);
        context.startActivity(intent);
    }
}
