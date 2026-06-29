package com.kaloko.app.controller;

import com.kaloko.app.dto.*;
import com.kaloko.app.service.UserService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/users")
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;

    @PostMapping("/register")
    public ResponseEntity<AuthenticationResponseDTO> register(@Valid @RequestBody UserRegisterRequestDTO request) {
        AuthenticationResponseDTO response = userService.register(request);
        return ResponseEntity.ok(response);
    }

    @PostMapping("/login")
    public ResponseEntity<AuthenticationResponseDTO> login(@Valid @RequestBody UserLoginRequestDTO request) {
        AuthenticationResponseDTO response = userService.login(request);
        return ResponseEntity.ok(response);
    }

    @PostMapping("/refresh")
    public ResponseEntity<TokenRefreshResponseDTO> refreshToken(@Valid @RequestBody RefreshTokenRequestDTO request) {
        TokenRefreshResponseDTO response = userService.refreshToken(request);
        return ResponseEntity.ok(response);
    }

    @PutMapping("/metrics")
    public ResponseEntity<UserResponseDTO> updateMetrics(@Valid @RequestBody UserMetricsUpdateRequestDTO request) {
        UserResponseDTO response = userService.updateMetrics(request);
        return ResponseEntity.ok(response);
    }
}
